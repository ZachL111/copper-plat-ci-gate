# Field Notes

`copper-plat-ci-gate` is easiest to review by starting with the fixture, not the prose.

The domain cases cover `rollout width`, `quota pressure`, `route drift`, and `secret scope`. They sit beside the smaller starter fixture so the project has both a compact scoring check and a domain-flavored review check.

`baseline` is the strongest case at 195 on `rollout width`. `edge` is the cautious anchor at 151 on `route drift`.

The point is not to make the repository bigger. The point is to make the important judgment testable.
