# copper-plat-ci-gate

`copper-plat-ci-gate` explores platform engineering with a small Java codebase and local fixtures. The technical goal is to package a Java local lab for ci analysis with seeded input scenarios, deterministic summary checks, and documented operating limits.

## Why I Keep It Small

The point is to make a small domain rule concrete enough that a reader can change it and immediately see what broke.

## Copper Plat Ci Gate Review Notes

The first comparison I would make is `rollout width` against `route drift` because it shows where the rule is most opinionated.

## Included Behavior

- `fixtures/domain_review.csv` adds cases for rollout width and quota pressure.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/copper-plat-ci-walkthrough.md` walks through the case spread.
- The Java code includes a review path for `rollout width` and `route drift`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Internal Model

The fixture data drives the tests. The code stays thin, while `metadata/domain-review.json` and `config/review-profile.json` explain what each case is meant to protect.

The Java implementation avoids hidden state so fixture changes are easy to reason about.

## Try It Locally

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Validation

That command is also the regression path. It verifies the domain cases and catches mismatches between the CSV, metadata, and code.

## Scope

This remains a local project with deterministic fixtures. It does not depend on credentials, hosted services, or live data. Future work should add richer malformed inputs before widening the public API.
