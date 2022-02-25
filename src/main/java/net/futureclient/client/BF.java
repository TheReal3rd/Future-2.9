package net.futureclient.client;

import net.futureclient.client.Ha;
import net.futureclient.client.Wf;
import net.futureclient.client.mF;
import net.minecraft.client.gui.GuiDownloadTerrain;

public class BF
extends Ha<Wf> {
    public final mF f$d;

    @Override
    public void f$E(Wf wf) {
        if (wf.f$E() instanceof GuiDownloadTerrain) {
            0.f$d.f$d.clear();
        }
    }

    public BF(mF mF2) {
        0.f$d = mF2;
    }
}
package net.futureclient.client;

import net.futureclient.client.Kf;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.entity.EntityLivingBase;

public class Bf
extends Kf {
    private ModelBase f$d;

    @Override
    public ModelBase f$E() {
        Bf bf;
        return bf.f$d;
    }

    public Bf(RenderLivingBase<?> renderLivingBase, EntityLivingBase entityLivingBase, ModelBase modelBase) {
        super(renderLivingBase, entityLivingBase, modelBase);
        0.f$d = modelBase;
    }
}
package net.futureclient.client;

import net.futureclient.client.De;
import net.futureclient.client.Ha;
import net.futureclient.client.Ze;

public class bf
extends Ha<De> {
    public final Ze f$d;

    public bf(Ze ze) {
        0.f$d = ze;
    }

    @Override
    public void f$E(De de) {
        Ze.f$a(0.f$d, null);
        Ze.f$E(0.f$d, null);
    }
}
package net.futureclient.client;

import net.futureclient.client.Ne;

public class bF
extends Ne {
    public bF() {
        bF bF2;
    }
}
