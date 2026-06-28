package net.mcjamweasel.moarconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.mcjamweasel.moarconcrete.MoarConcrete;
import net.mcjamweasel.moarconcrete.ModBlockGroups;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
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
                tag(BlockTags.MINEABLE_WITH_PICKAXE).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
                tag(BlockTags.NEEDS_STONE_TOOL).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
            }
        }


    //Add Wall tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_WALL){
            tag(BlockTags.WALLS).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
        }


    //Add Fence tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_FENCE){
            tag(BlockTags.FENCES).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
        }


    //Add Gate tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_GATE){
            tag(BlockTags.FENCE_GATES).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
        }


    //Add Button tags to each Block in the group
        for (ModBlockGroups.MCBlock block : ModBlockGroups.MC_BUTTON){
            tag(BlockTags.BUTTONS).add(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(MoarConcrete.MOD_ID, block.customBlock().getName().toString())));
        }

    }

}
