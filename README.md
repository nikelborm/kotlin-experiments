# Kotlin experiments

## Install deps

```bash
sudo pacman -Syu kotlin gradle
```

## How to compile

```bash
kotlinc ./main.kt -include-runtime -d ./dist/main.jar
```

## Run

```bash
java -jar ./dist/main.jar
kotlinc -script ./main.kts
```

## Both

```bash
kotlinc ./main.kt -include-runtime -d ./dist/main.jar && java -jar ./dist/main.jar testArgs
```
