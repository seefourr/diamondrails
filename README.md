_This mod is a continuation of [the mod of the same name by arthomnix](https://modrinth.com/mod/diamond-rails), source [here](https://github.com/arthomnix/diamondrails), which never updated from 1.19.2._

_All credit for the original code and assets (icons, models) goes to arthomnix. All code is freely usable under the MIT license._


# Diamond Rails
A mod that makes minecarts and rails viable as late-game transport, adding three new types of powered rails far faster than vanilla.

## Rails
### Powered rails (Vanilla, unchanged)
Top speed of **8 blocks a second**.
### Diamond rails
Top speed of **40 blocks a second**.
Crafted with the same recipe as powered rails, but with diamonds instead of gold.
### Enhanced diamond rails
Top speed of **80 blocks a second**.
Crafted by "enhancing" a diamond rail with a lapis block and a chorus fruit in a smithing table.
### Netherite rails
Top speed of **159.66 blocks a second** ([real-life world speed record for a wheeled high speed train](https://en.wikipedia.org/wiki/Railway_speed_record#Conventional_wheeled), 574.8 km/h aka 159.66 m/s).
Crafted by upgrading an enhanced diamond rail with a netherite smithing upgrade and a netherite ingot in a smithing table.

## Building railways
- It is currently impossible to turn corners or go uphill/downhill while travelling on any modded rails. 
  - Instead, use vanilla powered rails to slow minecarts down before turning corners.
  - Powered rails are also recommended for going uphill and downhill so you don't go flying off the track.
- Ideally, tracks should be straight and flat.
- The rails are actually not as expensive as you might think, as a couple diamond/enhanced diamond rails can give a minecart enough momentum for hundreds of blocks, or thousands for netherite rails.


## Potential future additions
- Copper rails; I did see [a mod](https://modrinth.com/mod/thecopperrail) which added copper rails with a "directional" function which could be interesting but I guess if you want that you can just get that mod yourself, it probably (untested) works with this mod
- Possibly outright buff default vanilla rail speed
- Uphill/downhill/corners on the mod's rails
- _I also need to slightly fix up the code as I messed up in the naming of the mod. It should be seefourr.diamond.rails and not diamond.rails.seefourr, as this results in "diamond" appearing first in the mod's files instead of "seefourr". :(. But it doesn't affect gameplay so this will probably stay on the backburner for a while._


## Notes on Minecart Experimental Changes
I've seen the recent snapshot and the experimental minecart changes and I hope at least the improvements to minecart movement, derailing and of course the speed changes make it into the base game. I  do intend to do either or both of the following:
- look through the experimental datapack and yoink their code in some way
- make future iterations of the mod use Mojang's form of rail code if possible and then implement the current mod's features as is. If I can I will try and make the mod's speeds customisable via gamerule
