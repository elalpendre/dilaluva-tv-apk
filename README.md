# DILALUVA TV — APK

App instalable (Android TV / Fire TV / móvil) que abre la app DILALUVA/NEXCERA.
A diferencia del navegador, reproduce listas `http` (igual que IBO), porque permite
"contenido mixto" dentro de la WebView.

## Cómo sale el APK (automático, gratis)

Al subir estos archivos a GitHub, se ejecuta solo el build (carpeta `.github/workflows/build.yml`)
y deja el **app-debug.apk** publicado en la pestaña **Releases** del repositorio.

Enlace directo del APK (cuando termine el build):
`https://github.com/<usuario>/<repo>/releases/latest/download/app-debug.apk`

## Instalar en la tele

1. En la tele, abrí **Downloader**.
2. Escribí el enlace del APK de arriba → **Go**.
3. Downloader lo descarga e instala. Aceptá "instalar de orígenes desconocidos" si lo pide.
4. Queda el ícono **DILALUVA TV** en la tele.

## Cambiar la dirección que abre

En `app/src/main/java/com/dilaluva/tv/MainActivity.java`, la constante `APP_URL`.
