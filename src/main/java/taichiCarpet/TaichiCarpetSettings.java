package taichiCarpet;

import carpet.api.settings.Rule;

import static carpet.api.settings.RuleCategory.*;

public class TaichiCarpetSettings
{
    private static final String TAICHI = "taichi";
    private  static final String LOGGER = "logger";
    private static final String PROTOCOL = "protocol";

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean optimizedFallDamageRaycast = false;

    @Rule(
            categories = { SURVIVAL, COMMAND, TAICHI }
    )
    public static String commandView = "ops";

    @Rule(
            categories = { SURVIVAL, COMMAND, TAICHI }
    )
    public static String commandSimulation = "ops";

    @Rule(
            categories = { SURVIVAL, COMMAND, TAICHI }
    )
    public static String commandHat = "ops";

    @Rule(
            categories = { SURVIVAL, COMMAND, TAICHI }
    )
    public static String commandSit = "ops";

    @Rule(
            categories = { COMMAND, LOGGER, TAICHI }
    )
    public static String commandNotice = "ops";

    @Rule(
            categories = { SURVIVAL, COMMAND, TAICHI }
    )
    public static String commandDataGet = "ops";

    @Rule(
            categories = { TAICHI }
    )
    public static boolean loginNotifier = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean optimizedDragonRespawn = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean disableWanderingOnCart = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean disableNetherPortalCollisionCheck = false;

    @Rule(
            categories = { SURVIVAL, PROTOCOL, TAICHI }
    )
    public static boolean blockInventorySyncing = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean optimizedHypot = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean optimizedRounding = false;

    @Rule(
            categories = { OPTIMIZATION, TAICHI }
    )
    public static boolean optimizedFurnaces = false;

    @Rule(
            categories = { CREATIVE, TAICHI },
            options = {"0", "1", "2", "3", "4"}
    )
    public static int defaultOpLevel = 0;

    @Rule(
            categories = { SURVIVAL, TAICHI },
            strict = false,
            options = { "#None", "https://discord.com/api/webhooks/0000/xxxxxxx" }
    )
    public static String deathNoticeDiscord = "#None";

    @Rule(
            categories = { SURVIVAL, TAICHI },
            options = { "embed", "text" }
    )
    public static String deathNoticeDiscordType = "embed";

    @Rule(
            categories = { SURVIVAL, TAICHI },
            strict = false,
            options = { "#None" }
    )
    public static String serverName = "#None";

    @Rule(
            categories = { PROTOCOL, TAICHI },
            strict = false,
            options = { "-1", "1", "2" }
    )
    public static int taichiPacketRateLimit = -1;

    @Rule(
            categories = { TAICHI }
    )
    public static boolean disablePassengerLimit = true;
}