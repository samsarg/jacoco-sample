# JaCoCo Android Sample App

This is a JaCoCo integration sample app. It uses
- Kotlin `1.5.21`
- Gradle `7.2`
- AGP `7.0.0`
- Jacoco `0.8.7`

## Report Generation

The jacoco report should be generated in `app/build/coverage-report` folder.

Use following command to generate the report.

```bash
./gradlew clean jacocoTestReport
```

## Issues
- `app/build/jacoco/testDebugUnitTest.exec` file is not being generated when using the above metnioned command while it is being generated when `./gradlew clean test` command is run.
- No report is generated in `app/build/coverage-report` folder.
