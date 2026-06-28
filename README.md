# Moar Concrete

> [!NOTE]
> 
> This is an unofficial fork of Moar Concrete for Minecraft 26.1 or higher. [Upstream repo here](https://github.com/mcjamweasel/moar-concrete-mod-1.21)

Stairs looking a bit bland? Bored of the same old slabs? Brighten your world up with Moar Concrete! Includes slabs, stairs, walls, bricks & fences in all 16 concrete colours.

The new Moar Concrete blocks are available in the crafting table and stonecutter.

<details>

<summary>Changelog</summary>

**v1.2** now includes fences and gates. Craft them in the table with iron bars (steel reinforced concrete, not stick reinforced concrete).

**v1.3** now includes buttons. Craft them in the table with a single concrete block. Recipe and tag builder code cleaned up.

**v1.4** adds support for Minecraft v1.21.2 & 1.21.3

**v1.5** includes brick blocks and concrete panels. Available from the crafting table and the stonecutter.

**v1.5.1** adds support for Minecraft v1.21.4

**v1.5.2** adds support for Minecraft v1.21.5

**v1.5.3** is just under-the-hood changes, no new functionality and build not released

**v1.3.1** brings bricks, brick slabs and panels to 1.21.0 & 1.21.1.

**v1.6.0** includes support for Minecraft 1.21.6 pre-release 2. Refactored blocktag datagen. Build will release with 1.21.6.

---

**v1.7.0** supports Minecraft 26.1.2.

</details>

## Installation

Moar Concrete is a Fabric mod, which means it requires the Fabric Loader. Once you have installed Fabric Loader, you can simply place Moar Concrete into your mods folder like anything else.


## Usage

Moar Concrete is plug & play - once installed it will be active. Moar Concrete blocks will be available in the crafting table and stonecutter in survival and creative, as well as in the creative coloured blocks menu.


## Build

1. Clone the repository
2. Run `./gradlew runDatagen` to generate the textures (otherwise you will get texture problems in game)
3. Run `./gradlew build` to build the mod
