## v4.1 (unreleased)
- `app`, `test`, and `xctestrun-file` now support `~`, environment variables, and globs (`*`, `**`) when resolving paths. [#386](https://github.com/TestArmada/flank/pull/386)
- Update `flank android run` to support `--app`, `--test`, `--test-targets`, `--use-orchestrator` and `--no-use-orchestrator`.

## v4.0.0

- Add `flank cancel` command. See `flank cancel --help`
- Add `flank refresh` command. See `flank refresh --help`
- Automatically detect projectId from service account credential
- Always generate aggregated JUnit XML reports
- Update HTML report to use create-react-app v2.1.0
- Add support for Xcode 10.1
- Improve test parsing to detect Swift tests that throw errors
- Update Flank exit codes, see readme for details.
- Link to matrix root when testing on multiple devices
