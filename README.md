# Future 2.9
Future that is free and open source. How software should be.

#Check list:
1. Identify All the classes / Organize them.
2. Make the Client Build with only required modules & components working.
3. Fix Bugs.
4. Make all modules working.
5. Fix Bugs.
6. Done.

#TODO
1. Modules Semi Complete
   1. Module Manager Half Done
   2. Modules Incomplete
2. Commands Incomplete
   1. Manager Half Complete
   2. Commands Identified just needs clearing up and finishing up.
3. Logger Complete
4. Settings Complete
5. Mixins Incomplete
6. Events Semi Complete
   1. Base classes created.
7. BaritoneAPI Incomplete
   1. Base classes created with errors still.
8. Utils Incomplete
   1. Main Classes for the client incomplete.
   2. Started Util classes still incomplete.


#Class Table
This is where ill create a table of OG classes plus other leaked classes linked with the renamed / deof classes.

Semi De-Obfuscated Source: https://github.com/adddison/minecraft-client-archive/blob/main/clients/1.9.x-1.12.x/Non-Skids/future-2.9-deobf-searge.jar

Obfuscated Source: https://github.com/MrCreepyYT/Future-2.12-De-Obf-Crack
This one isn't de-obf its fake / joke.

| Renamed Class           | Obfuscated 1 | Semi Deof 1 | Description                                              |
|-------------------------|--------------|-------------|----------------------------------------------------------|
| FutureClient            | kH           | Nah         | Main class that holds managers.                          |
| ModuleStandard          | Ba           | Nah         | Base class for Modules.                                  |
| ModuleManager           | Hf           | Nah         | Class that Manages Modules.                              |
| ModuleBase              | ma           | Nah         | Base class for Modules.                                  |
| Listener                | Ha           | Nah         | Where Events are invoked.                                |
| PacketEvent             | Ye           | Nah         | PacketEvent.                                             |
| IString                 | F            | Nah         | Unknown Interface with single method used in ig_Unknown. |
| CommandBase             | GA           | Nah         | Base Class for Commands.                                 |
| CommandManager          | AG           | Nah         | Command Manager.                                         |
| FutureLogger            | La           | Nah         | Logging Utils.                                           |
| ILogger                 | E            | Nah         | Interface for FutureLogger.                              |
| DelayTimer              | gG           | Nah         | System Time delay class.                                 |
| EntityUtils             | Pg           | Nah         | Entity interaction utilities.                            |
| ObjectList              | QE           | Nah         | Class that allows list to be created?                    |
| TPSCalcListener         | VG           | Nah         | Listens to events to Calc TPS.                           |
| TPSCalc                 | RG           | Nah         | Holds and Calcs TPS data / values.                       |
| ShutdownListener        | Vg           | Nah         | Listens to when the Games is closing down.               |
| CategoryEnum            | JD           | Nah         | Enum Class that holds Modules Categories.                |
| SettingsBase            | z            | Nah         | Base class for all settings.                             |
| EnumSetting             | ka           | Nah         | Enum Setting class.                                      |
| BlockList               | U            | Nah         | MC Block list setting.                                   |
| BlockStateList          | ha           | Nah         | MC IBlockState list setting.                             |
| ItemList                | n            | Nah         | MC Item list setting.                                    |
| ListSetting             | O            | Nah         | Abstract list base class.                                |
| ig_Unknown              | ig           | Nah         | Unknown Class used in ModulesStandard                    |
| CFontDraw               | fG           | Nah         | Font class used in hud.                                  |
| BH_Font_Object          | BH           | Nah         | An object used to hold data for font rendering.          |
| Event                   | RF           | Nah         | Event Base class.                                        |
| EventManager            | IH           | Nah         | Manages and executes events.                             |
| IEventManager           | W            | Nah         | Interface for EventManager.                              |
| Af_Unknown_Event        | AF           | Nah         | Unknown Event.                                           |
| MoveEvent               | Ee           | Nah         | MoveEvent for player movement events.                    |
| ShutdownEvent           | *Lost*       | Nah         | Event executed when client is shutting down.             |
| WorldClientEvent        | De           | Nah         | World events.                                            |
| Hud                     | gF           | Nah         | Hud Module.                                              |
| ScaledResEvent          | Zd           | Nah         | ScaledResolution Event.                                  |
| NumberSetting           | s            | Nah         | Setting type used to hold Number based settings.         |
| Colours                 | wD           | Nah         | Colours is a modules that holds colour settings.         |
| ColourUtils             | vH           | Nah         | Colour Utils.                                            |
| AE_TimeTask             | AE           | Nah         | Timed Task that for HUD module.                          |
| InputEvent              | kE           | Nah         | Input event for mouse and keyboard.                      |
| KeybindListener         | cF           | Nah         | Keybind listener for Modulemanager.                      |
| MacroManager            | lf           | Nah         | Manager for macros.                                      |
| MacroObject             | lg           | Nah         | MacroObject holds data for Macros.                       |
| MacroListener           | BD           | Nah         | MacroListener used to listen for key presses.            |
| MacroFile               | nf           | Nah         | MacroFile saving.                                        |
| FileObject              | Ib           | Nah         | File Saving utils.                                       |
| ILoad                   | j            | Nah         | Interface for load.                                      |
| ISave                   | g            | Nah         | Interface for save.                                      |
| CommandFile             | Vi           | Nah         | File saving for CommandManager.                          |
| AltManager              | xI           | Nah         | Manager that handles login and outs of Alts.             |
| AltObject               | ph           | Nah         | Alt Data object.                                         |
| AltTypeEnum             | jG           | Nah         | AltType alt type enum.                                   |
| AltJson                 | Aj           | Nah         | Json related class for AltManager.                       |
| TickEvent               | ME           | Nah         | Event trigger every in-game tick.                        |
| AntiBot                 | mF           | Nah         | AntiBot Module that filters bots from players.           |
| AB_Tick_Listener        | cE           | Nah         | AntiBot Tick Listener                                    |
| GUIScreenEvent          | Wf           | Nah         | Event Triggered when GUIScreen is changed.               |
| AB_GUIScreen_Listener   | BF           | Nah         | AntiBot GUIScreenEvent Listener.                         |
| AB_WorldClient_Listener | QF           | Nah         | AntiBot WorldClient Listener.                            |
| PacketTwoEvent          | IE           | Nah         | PacketEvent (Probably delete later.)                     |
| PacketThreeEvent        | jf           | Nah         | PacketEvent (Probably delete later.)                     |
| AB_Packet_Listener      | wF           | Nah         | AntiBot Packet Listener                                  |
| DelayTimer              | Bh           | Nah         | AutoArmour Delay class.                                  |
| PriorityEnum            | yf           | Nah         | AutoArmour Priority enum for settings.                   |
| AutoArmour              | ef           | Nah         | AutoArmour Module.                                       |
| AA_Tick_Listener        | uD           | Nah         | AutoArmour TicEvent Listener                             |
| AutoTotem               | yE           | Nah         | AutoTotem Module                                         |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |
| Content                 | Content      | Nah         | Content                                                  |