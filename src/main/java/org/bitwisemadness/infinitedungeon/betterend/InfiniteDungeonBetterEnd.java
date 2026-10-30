package org.bitwisemadness.infinitedungeon.betterend;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

/**
 * Template mod entry point.
 *
 * <p>Rename {@link #MOD_ID} to match {@code mod_id} in {@code gradle.properties} as
 * part of the rename checklist in the README.</p>
 */
@Mod(InfiniteDungeonBetterEnd.MOD_ID)
public final class InfiniteDungeonBetterEnd {

    public static final String MOD_ID = "infinite_dungeon_better_end";
    public static final Logger LOGGER = LogUtils.getLogger();

    public InfiniteDungeonBetterEnd(IEventBus modBus) {
        LOGGER.info("Infinite Dungeon: Better End initialized");
    }
}
