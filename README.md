java-project-template
=====================

java (build by gradle) project template.

Gradle のバージョン
-------------------

- Gradle 9 以降は実行に JDK 17 以上が必要なので、Gradle 自体を JDK 8 で動かす場合は 8.14.x が上限
- Java 8 で Gradle daemon を動かすと「Executing the Gradle daemon with JVM 16 or earlier has been deprecated」という非推奨警告が出るが、想定内
- Gradle を上げるときは wrapper タスクを 2 回実行する。wrapper タスクは https://services.gradle.org/versions/8 から 8 系の最新版を取得する (gradle/misc.gradle)。2 回目で gradle-wrapper.jar と gradlew スクリプトも更新される

```
./gradlew wrapper
./gradlew wrapper
```
