package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootSubProvider;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.core.HolderLookup;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootSubProvider {
    public ModLootTableProvider(FabricPackOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {

    //Normal block drops for all blocks
        //For each block group in the array:
        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcGroups) {
            //For each Block in the group
            for (ModBlockGroups.MCBlock block : group) {
                //Add drop
                dropSelf(block.customBlock());
            }
        }


    //Slab drops for slab blocks
        // For each block group in the array:
        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcSlabDropGroup) {
            //For each Block in the group
            for (ModBlockGroups.MCBlock block : group) {
                //Add drop
                add(block.customBlock(), createSlabItemTable(block.customBlock()));
            }
        }
    }
}
