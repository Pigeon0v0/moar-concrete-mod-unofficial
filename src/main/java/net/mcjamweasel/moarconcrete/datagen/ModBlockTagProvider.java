package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.core.HolderLookup;
import net.minecraft.tags.BlockTags;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagsProvider.BlockTagsProvider {
    public ModBlockTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {

    //For each block group in the array:
        for (List<ModBlockGroups.MCBlock> group : ModBlockGroups.mcGroups) {
            //For each Block in the group
            for (ModBlockGroups.MCBlock block : group) {
                //Add pickaxe & stone tool tags
                valueLookupBuilder(BlockTags.MINEABLE_WITH_PICKAXE).add(block.customBlock());
                valueLookupBuilder(BlockTags.NEEDS_STONE_TOOL).add(block.customBlock());
            }
        }


    //Add Wall tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_WALL){
            valueLookupBuilder(BlockTags.WALLS).add(block.customBlock());
        }


    //Add Fence tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_FENCE){
            valueLookupBuilder(BlockTags.FENCES).add(block.customBlock());
        }


    //Add Gate tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_GATE){
            valueLookupBuilder(BlockTags.FENCE_GATES).add(block.customBlock());
        }


    //Add Button tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_BUTTON){
            valueLookupBuilder(BlockTags.BUTTONS).add(block.customBlock());
        }

    }

}
