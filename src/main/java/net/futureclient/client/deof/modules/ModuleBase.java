package net.futureclient.client.deof.modules;

import com.google.gson.*;
import net.futureclient.client.deof.FutureClient;
import net.futureclient.client.deof.unknown.kB_Unknown;
import net.futureclient.client.deof.settings.EnumSetting;
import net.futureclient.client.deof.settings.listSetting.BlockList;
import net.futureclient.client.deof.settings.listSetting.BlockStateList;
import net.futureclient.client.deof.settings.listSetting.ItemList;
import net.futureclient.client.deof.settings.listSetting.ListSetting;
import net.futureclient.client.deof.settings.SettingsBase;
import net.futureclient.client.deof.utils.enums.CategoryEnum;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class ModuleBase implements IModule {
    private List<kB_Unknown> events;// OG f$g OG kB
    public static Minecraft mc = Minecraft.getMinecraft();// OG f$d
    private List<SettingsBase<?>> settings;// OG f$M OG z
    private String[] terms;// OG f$b
    private String name;// OG f$K
    public CategoryEnum category;//OG f$i
    private static final Gson gson = new GsonBuilder().setPrettyPrinting().create(); // OG f$I
    private String name1;// OG f$j

    public ModuleBase(String name, String ... searchTerms) {
        this.settings = new ArrayList<>();
        this.events = new ArrayList<>();
        this.name = this.name1 = name;
        this.terms = searchTerms;
    }

    public void setEvents(kB_Unknown... kBArray) {
        Collections.addAll(this.events, kBArray);
        this.events.sort(Comparator.comparing(kB_Unknown::getString));
    }

    public SettingsBase<?> searchSettings(String string) {
        for (SettingsBase<?> setting : this.settings) {
            int n;
            String[] stringArray = setting.getNames();
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string2 = stringArray[n];
                if (string.equalsIgnoreCase(string2)) {
                    return setting;
                }
                n3 = ++n;
            }
        }
        return null;
    }

    public List<SettingsBase<?>> getSettings() {
        return this.settings;
    }

    public void setEvents(List<kB_Unknown> list) {
        this.events = list;
    }

    public void setSettings(List<SettingsBase<?>> list) {
        this.settings = list;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void setSearchTerms(String[] stringArray) {
        this.terms = stringArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void save() {
        File file = new File(FutureClient., "modules");//TODO fix this its probably get the name of the client.
        if (!file.exists()) file.mkdir();

        if ((file = new File(file, this.getName().toLowerCase().replace(" ", "") + ".json")).exists()) file.delete();

        if (this.getEvents().isEmpty()) return;

        try {
            file.createNewFile();
        } catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }

        JsonObject jsonObject = new JsonObject();
        Collections.unmodifiableCollection(this.getSettings()).forEach(z2 -> {
            if (z2 instanceof ListSetting) {
                JsonObject jsonObject2;
                JsonArray jsonArray = new JsonArray();
                if (z2 instanceof ItemList) {
                    ItemList itemList = (ItemList) z2;
                    List<Item> list = itemList.getValue();
                    list.forEach(item -> {
                        final ResourceLocation rl = Item.REGISTRY.getNameForObject(item);
                        if (rl != null) {
                            jsonArray.add(rl.toString());
                        }
                    });
                    jsonObject2 = jsonObject;
                } else if (z2 instanceof BlockList) {
                    BlockList u = (BlockList) z2;
                    List<Block> list = u.getValue();
                    list.forEach(block -> jsonArray.add(((ResourceLocation) Block.REGISTRY.getNameForObject(block)).toString()));
                    jsonObject2 = jsonObject;
                } else {
                    if (z2 instanceof BlockStateList) {
                        BlockStateList ha2 = (BlockStateList) z2;
                        List<IBlockState> list = ha2.getValue();
                        list.stream().map(IBlockState::getBlock).forEach(block -> jsonArray.add(((ResourceLocation)Block.REGISTRY.getNameForObject(block)).toString()));
                    }
                    jsonObject2 = jsonObject;
                }
                jsonObject2.add(z2.getNames()[0], (JsonElement)jsonArray);
                return;
            }
            jsonObject.addProperty(z2.getNames()[0], z2.getNames().toString());//TODO Not sure this was correct.
        });

        if (jsonObject.entrySet().isEmpty()) return;

        try {
            FileWriter fileWriter;
            block18: {
                fileWriter = new FileWriter(file);
                Throwable throwable = null;
                try {
                    fileWriter.write(gson.toJson((JsonElement)jsonObject));
                    if (fileWriter == null) return;
                    if (throwable == null) break block18;
                } catch (Throwable throwable2) {
                    try {
                        throwable = throwable2;
                        throw throwable;
                    } catch (Throwable throwable3) {
                        Throwable throwable4;
                        if (fileWriter != null) {
                            if (throwable != null) {
                                try {
                                    fileWriter.close();
                                    throwable4 = throwable3;
                                    throw throwable4;
                                }
                                catch (Throwable throwable5) {
                                    throwable4 = throwable3;
                                    throwable.addSuppressed(throwable5);
                                    throw throwable4;
                                }
                            }
                            fileWriter.close();
                        }
                        throwable4 = throwable3;
                        throw throwable4;
                    }
                }
                try {
                    fileWriter.close();
                    return;
                } catch (Throwable throwable6) {
                    throwable.addSuppressed(throwable6);
                    return;
                }
            }
            fileWriter.close();
            return;
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            file.delete();
        }
    }

    public void setName(String string) {
        this.name = string;
    }

    public void addSettings(SettingsBase<?> ... zArray) {
        Collections.addAll(this.settings, zArray);
    }

    private void load(Map.Entry<?,?> entry) {
        for(SettingsBase<?> setting : this.getSettings()) {
            if (!setting.getNames()[0].equalsIgnoreCase((String)entry.getKey())) continue;

            final JsonElement entry1 = (JsonElement)entry.getValue();

            if (setting instanceof ListSetting) {
                if (!entry1.isJsonArray()) break;
                final JsonArray jsonArray = entry1.getAsJsonArray();
                final ArrayList<String> arrayList = new ArrayList<>();
                jsonArray.forEach(jsonElement -> {
                    if (jsonElement.isJsonPrimitive()) {
                        final JsonPrimitive primitive = jsonElement.getAsJsonPrimitive();
                        if(primitive.isString()) arrayList.add(primitive.getAsString());
                    }
                });
                if (setting instanceof ItemList) {
                    final ItemList n2 = (ItemList) setting;
                    final ArrayList<Item> arrayList2 = new ArrayList<>();
                    arrayList.forEach(string -> {
                        final Item item = Item.getByNameOrId((String)string);
                        if (item == null) return;
                        arrayList2.add(item);
                    });
                    n2.setValue(arrayList2);
                    return;
                }
                if (setting instanceof BlockList) {
                    final BlockList u = (BlockList) setting;
                    final ArrayList<Block> arrayList3 = new ArrayList<>();
                    arrayList.forEach(string -> {
                        Block block = Block.getBlockFromName(string);
                        if (block == null) return;
                        arrayList3.add(block);
                    });
                    u.setValue(arrayList3);
                    return;
                }
                if (!(setting instanceof BlockStateList)) break;
                final BlockStateList ha2 = (BlockStateList)setting;
                final ArrayList<IBlockState> arrayList4 = new ArrayList<>();
                arrayList.forEach(string -> {
                    final Block block = Block.getBlockFromName(string);
                    if (block == null) return;
                    arrayList4.add(block.getDefaultState());
                });
                ha2.setValue(arrayList4);
                return;
            }
            if (!entry1.isJsonPrimitive()) break;
            final JsonPrimitive jsonPrimitive = entry1.getAsJsonPrimitive();
            if (setting.value instanceof Number) {
                if (setting.value instanceof Integer) {
                    final SettingsBase<Integer> intSetting = (SettingsBase<Integer>) setting;
                    intSetting.setValue(jsonPrimitive.getAsInt());
                    return;
                }
                if (setting.value instanceof Long) {
                    final SettingsBase<Long> intSetting = (SettingsBase<Long>) setting;
                    intSetting.setValue(jsonPrimitive.getAsLong());
                    return;
                }
                if (setting.value instanceof Double) {
                    final SettingsBase<Double> intSetting = (SettingsBase<Double>) setting;
                    intSetting.setValue(jsonPrimitive.getAsDouble());
                    return;
                }
                if (!(setting.value instanceof Float)) break;
                final SettingsBase<Float> intSetting = (SettingsBase<Float>) setting;
                intSetting.setValue(jsonPrimitive.getAsFloat());
                return;
            }
            if (setting.value instanceof Enum) {
                ((EnumSetting<?>)setting).search(jsonPrimitive.getAsString());
                return;
            }
            if (setting.value instanceof Boolean) {
                final SettingsBase<Boolean> intSetting = (SettingsBase<Boolean>) setting;
                intSetting.setValue(jsonPrimitive.getAsBoolean());
                return;
            }
            if (!(setting.value instanceof String)) break;
            final SettingsBase<String> intSetting = (SettingsBase<String>) setting;
            intSetting.setValue(jsonPrimitive.getAsString());
            return;
        }
    }

    public void setName1(String string) {
        this.name1 = string;
    }

    public String getName1() {
        return this.name1;
    }

    public String[] getTerms() {
        return this.terms;
    }

    public CategoryEnum getCategory() {
        return this.category;
    }

    public kB_Unknown getEvent(String string) {
        for (kB_Unknown kB2 : this.events) {
            if (!string.equalsIgnoreCase(kB2.getString())) continue;
            return kB2;
        }
        return null;
    }

    public List<kB_Unknown> getEvents() {
        return this.events;
    }

    /*
     * Exception decompiling
     */
    public void f$e() {//TODO figure out whats this does. Probably the read section.
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         *
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK], 0[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:845)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
         *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
         *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
         *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
         *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
         *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
         *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
         *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}
/*
public class ma implements F {
    private List<kB> f$g;
    public static Minecraft f$d;
    private List<z> f$M;
    private String[] f$b;
    private String f$K;
    public JD f$i;
    private static final Gson f$I;
    private String f$j;

    public ma(String string, String ... stringArray) {
        ma ma2 = 0;
        ma ma3 = 0;
        0.f$M = new ArrayList<z>();
        ma3.f$g = new ArrayList<kB>();
        ma2.f$K = 0.f$j = string;
        ma2.f$b = stringArray;
    }

    public void f$E(kB ... kBArray) {
        ma ma2 = 0;
        Collections.addAll(ma2.f$g, kBArray);
        ma2.f$g.sort(Comparator.comparing(kB::f$E));
    }

    public z f$E(String string) {
        for (z z2 : 0.f$M) {
            int n;
            String[] stringArray = z2.f$E();
            int n2 = stringArray.length;
            int n3 = n = 0;
            while (n3 < n2) {
                String string2 = stringArray[n];
                if (string.equalsIgnoreCase(string2)) {
                    return z2;
                }
                n3 = ++n;
            }
        }
        return null;
    }

    public List<z> f$a() {
        ma ma2;
        return ma2.f$M;
    }

    public void f$E(List<kB> list) {
        0.f$g = list;
    }

    public void f$a(List<z> list) {
        0.f$M = list;
    }

    @Override
    public String f$E() {
        ma ma2;
        return ma2.f$K;
    }

    public void f$E(String[] stringArray) {
        0.f$b = stringArray;
    }


     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation

//public void f$a() {
//    ma ma2;
//    File file = new File(kH.f$E().f$E(), "modules");
//    if (!file.exists()) {
//        file.mkdir();
//    }
//    if ((file = new File(file, ma2.f$E().toLowerCase().replace(" ", "") + ".json")).exists()) {
//        file.delete();
//    }
    if (ma2.f$a().isEmpty()) {
        return;
    }
    try {
        file.createNewFile();
    }
    catch (IOException iOException) {
        iOException.printStackTrace();
        return;
    }
    JsonObject jsonObject = new JsonObject();
    Collections.unmodifiableCollection(ma2.f$a()).forEach(z2 -> {
        if (z2 instanceof O) {
            JsonObject jsonObject2;
            JsonArray jsonArray = new JsonArray();
            if (z2 instanceof n) {
                n n2 = (n)z2;
                List list = (List)n2.f$E();
                list.forEach(item -> {
                    if ((item = (ResourceLocation)Item.REGISTRY.getNameForObject(item)) != null) {
                        jsonArray.add(item.toString());
                    }
                });
                jsonObject2 = jsonObject;
            } else if (z2 instanceof U) {
                U u = (U)z2;
                List list = (List)u.f$E();
                list.forEach(block -> jsonArray.add(((ResourceLocation)Block.REGISTRY.getNameForObject(block)).toString()));
                jsonObject2 = jsonObject;
            } else {
                if (z2 instanceof ha) {
                    ha ha2 = (ha)z2;
                    List list = (List)ha2.f$E();
                    list.stream().map(IBlockState::getBlock).forEach(block -> jsonArray.add(((ResourceLocation)Block.REGISTRY.getNameForObject(block)).toString()));
                }
                jsonObject2 = jsonObject;
            }
            jsonObject2.add(z2.f$E()[0], (JsonElement)jsonArray);
            return;
        }
        jsonObject.addProperty(z2.f$E()[0], z2.f$E().toString());
    });
    if (jsonObject.entrySet().isEmpty()) {
        return;
    }
    try {
        FileWriter fileWriter;
        block18: {
            fileWriter = new FileWriter(file);
            Throwable throwable = null;
            try {
                fileWriter.write(f$I.toJson((JsonElement)jsonObject));
                if (fileWriter == null) return;
                if (throwable == null) break block18;
            }
            catch (Throwable throwable2) {
                try {
                    throwable = throwable2;
                    throw throwable;
                }
                catch (Throwable throwable3) {
                    Throwable throwable4;
                    if (fileWriter != null) {
                        if (throwable != null) {
                            try {
                                fileWriter.close();
                                throwable4 = throwable3;
                                throw throwable4;
                            }
                            catch (Throwable throwable5) {
                                throwable4 = throwable3;
                                throwable.addSuppressed(throwable5);
                                throw throwable4;
                            }
                        }
                        fileWriter.close();
                    }
                    throwable4 = throwable3;
                    throw throwable4;
                }
            }
            try {
                fileWriter.close();
                return;
            }
            catch (Throwable throwable6) {
                throwable.addSuppressed(throwable6);
                return;
            }
        }
        fileWriter.close();
        return;
    }
    catch (Throwable throwable) {
        throwable.printStackTrace();
        file.delete();
    }
}

    public void f$E(String string) {
        0.f$K = string;
    }

    public void f$E(z ... zArray) {
        Collections.addAll(0.f$M, zArray);
    }

    private void f$E(Map.Entry entry) {
        Iterator iterator;
        Iterator<z> iterator2 = iterator = 0.f$a().iterator();
        while (iterator2.hasNext()) {
            z z2 = iterator.next();
            if (!z2.f$E()[0].equalsIgnoreCase((String)entry.getKey())) {
                iterator2 = iterator;
                continue;
            }
            entry = (JsonElement)entry.getValue();
            z z3 = z2;
            iterator = z3.f$E();
            if (z3 instanceof O) {
                if (!entry.isJsonArray()) break;
                JsonArray jsonArray = entry.getAsJsonArray();
                ArrayList arrayList = new ArrayList();
                jsonArray.forEach(jsonElement -> {
                    if (jsonElement.isJsonPrimitive() && (jsonElement = jsonElement.getAsJsonPrimitive()).isString()) {
                        arrayList.add(jsonElement.getAsString());
                    }
                });
                if (z2 instanceof n) {
                    n n2 = (n)z2;
                    ArrayList arrayList2 = new ArrayList();
                    arrayList.forEach(string -> {
                        if ((string = Item.getByNameOrId((String)string)) == null) {
                            return;
                        }
                        arrayList2.add(string);
                    });
                    n2.f$E(arrayList2);
                    return;
                }
                z z4 = z2;
                if (z2 instanceof U) {
                    U u = (U)z4;
                    ArrayList arrayList3 = new ArrayList();
                    arrayList.forEach(string -> {
                        if ((string = Block.getBlockFromName((String)string)) == null) {
                            return;
                        }
                        arrayList3.add(string);
                    });
                    u.f$E(arrayList3);
                    return;
                }
                if (!(z4 instanceof ha)) break;
                ha ha2 = (ha)z2;
                ArrayList arrayList4 = new ArrayList();
                arrayList.forEach(string -> {
                    if ((string = Block.getBlockFromName((String)string)) == null) {
                        return;
                    }
                    arrayList4.add(string.getDefaultState());
                });
                ha2.f$E(arrayList4);
                return;
            }
            if (!entry.isJsonPrimitive()) break;
            JsonPrimitive jsonPrimitive = entry.getAsJsonPrimitive();
            if (iterator instanceof Number) {
                if (iterator instanceof Integer) {
                    z2.f$E(jsonPrimitive.getAsInt());
                    return;
                }
                if (iterator instanceof Long) {
                    z2.f$E(jsonPrimitive.getAsLong());
                    return;
                }
                if (iterator instanceof Double) {
                    z2.f$E(jsonPrimitive.getAsDouble());
                    return;
                }
                if (!(iterator instanceof Float)) break;
                z2.f$E(Float.valueOf(jsonPrimitive.getAsFloat()));
                return;
            }
            if (iterator instanceof Enum) {
                ((ka)z2).f$E(jsonPrimitive.getAsString());
                return;
            }
            if (iterator instanceof Boolean) {
                z2.f$E(jsonPrimitive.getAsBoolean());
                return;
            }
            if (!(iterator instanceof String)) break;
            z2.f$E(jsonPrimitive.getAsString());
            return;
        }
    }

    public void f$a(String string) {
        0.f$j = string;
    }

static {
        f$I = new GsonBuilder().setPrettyPrinting().create();
        f$d = Minecraft.getMinecraft();
        }

public String f$a() {
        ma ma2;
        return ma2.f$j;
        }

public String[] f$E() {
        ma ma2;
        return ma2.f$b;
        }

public JD f$E() {
        ma ma2;
        return ma2.f$i;
        }

public kB f$E(String string) {
        for (kB kB2 : 0.f$g) {
        if (!string.equalsIgnoreCase(kB2.f$E())) continue;
        return kB2;
        }
        return null;
        }

public List<kB> f$E() {
        ma ma2;
        return ma2.f$g;
        }


 * Exception decompiling

public void f$e() {

         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         *
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [6[CATCHBLOCK], 0[TRYBLOCK]], but top level block is 3[TRYBLOCK]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:845)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1037)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:929)
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:75)
         *     at me.coley.recaf.decompile.cfr.CfrDecompiler.decompile(CfrDecompiler.java:71)
         *     at dev.fxe.recaf4forge.utils.Exporter.exportSrc(Exporter.java:80)
         *     at dev.fxe.recaf4forge.utils.Exporter.lambda$exportMDK$0(Exporter.java:43)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.run(CompletableFuture.java:1640)
         *     at java.util.concurrent.CompletableFuture$AsyncRun.exec(CompletableFuture.java:1632)
         *     at java.util.concurrent.ForkJoinTask.doExec(ForkJoinTask.java:289)
         *     at java.util.concurrent.ForkJoinPool$WorkQueue.runTask(ForkJoinPool.java:1067)
         *     at java.util.concurrent.ForkJoinPool.runWorker(ForkJoinPool.java:1703)
         *     at java.util.concurrent.ForkJoinWorkerThread.run(ForkJoinWorkerThread.java:172)

        throw new IllegalStateException("Decompilation failed");
        }
        }
 */