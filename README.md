# kmp

the reproduction of [CMP-9429](https://youtrack.jetbrains.com/issue/CMP-9429)

download app-release-kmp.zip from [runs/21069308242](https://github.com/lisonge/kmp-startup/actions/runs/21069308242)

## slow startup example

double click `li.songe.kmp.exe` in file explorer

```text
java: 21.0.9+10-LTS
jvm -> main: 17ms
main -> Window: 1302ms
Window -> App: 1199ms
```

![Image](https://e.gkd.li/20b27b0f-ae47-4ca2-a70b-927611958dea)

## fast startup example

run `C:\Users\lisonge\Downloads\app-release-kmp\li.songe.kmp.exe` in window terminal pwsh

```text
java: 21.0.9+10-LTS
jvm -> main: 5ms
main -> Window: 357ms
Window -> App: 398ms
```

![Image](https://e.gkd.li/eb242ad1-218c-4065-b7fe-fe1bb6b4800a)
