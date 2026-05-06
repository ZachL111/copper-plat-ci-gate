# Copper Plat Ci Gate Walkthrough

This note is the quickest way to read the extra review model in `copper-plat-ci-gate`.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | rollout width | 195 | ship |
| stress | quota pressure | 162 | ship |
| edge | route drift | 151 | ship |
| recovery | secret scope | 162 | ship |
| stale | rollout width | 194 | ship |

Start with `baseline` and `edge`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `rollout width` against `route drift`, not the raw score alone.
