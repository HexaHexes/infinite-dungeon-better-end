# Repo rules - infinite-dungeon-better-end

Repo-specific rules and notes. The org-wide `AGENTS.md` beside this file is
maintained in [
eoforge-mod-template](https://github.com/HexaHexes/neoforge-mod-template)
and pulled in verbatim - **never hand-edit it.** Everything in this file is this
repo's own and is edited freely; keep it aligned with the org rules rather than
restating them.

**Repo:** `HexaHexes/infinite-dungeon-better-end` - **Mod ID:** `infinite_dungeon_better_end` - **Branch:** `main`
**Platform:** Minecraft 1.21.1 / NeoForge 21.1.259 / JDK 21 - **Jar:** `build/libs/infinite_dungeon_better_end-<version>.jar`

Adds the Better End dimension - one of the seven sibling dimension addons ported from the
Dungeon Crawl - Dimensional Patch datapacks (project 1189484): this addon ships one
dimension + dimension_type JSON, one `infinite_dungeon` dimension profile (curves,
pools, PortalPolicy, announcements), the Dungeon Crawl gate tag and mirror structure set
with its own salt, and the ported content pack (types, biome mappings, staged loot and
treasure, theming).

**Dependencies**
- Required: Minecraft, NeoForge, **BetterEnd** `betterend [21.0.39,)` (org ruling: target mod is a hard dependency; via the New Dawn NeoForge continuation - Modrinth IcERKldh file mGr2PWLA, since the original BetterX mod has no NeoForge 1.21.1 build - which hard-requires bclib, wover and wunderlib).
- Dev classpath: `maven.modrinth:betterend-neoforge:21.0.39` + `bclib-neoforge:21.0.28` + `worldweaver-neoforge:21.0.30` + `wunderlib-neoforge:21.0.11` through the devRuntime bucket in build.gradle (the closed transitive set FML needs) - never packaged, POM-clean.
- Planned for first implementation: `infinite-dungeon-api` (dimension profiles),
  Dungeon Crawl (content contract, CF 324973 file 7887320 / Modrinth q0rRg4lH),
  and the profile-driven core of HexaHexes/infinite-dungeon (issues #162, #163).

**Test:** `./gradlew runGameTestServer` - `InfiniteDungeonBetterEndGameTests` (1 test).
`expectedTests = 1` in `build.gradle` must match the `@GameTest` count.

**Gotchas**
- The template's mixin config ships empty (no mixins planned); remove it in the first
  real PR if it stays unused.
- Porting rules from the blueprint: theme files must end `_0.json`..`_3.json`
  (`_no_pillars_` in the name disables pillars); the datapack's per-dimension monster
  staging is superseded by profile `ProfilePools`; the biome gate entry must name THIS
  dimension's own biome, not the source pack's.
- No dimension exists until the core gates (#162, #163) land; until then this
  addon compiles and does nothing.
## Dependency graph

- Disabled for newly created repos under this org, so `.github/workflows/dependency-submission.yml`
  is deliberately absent: it fails every push with "Dependency graph is disabled" until the
  org flips the default. Re-add it (copy from neoforge-mod-template) once a
  dependency-submission run can succeed; `dependency-review.yml` stays and may
  report the same way at the first PR - non-required until a ruleset says
  otherwise. (Same remedy the sibling charters record - see undergarden's REPO.md.)
