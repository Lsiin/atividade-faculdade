
$files = Get-ChildItem -Path "listas_de_exercicios" -Recurse -Filter "*.java"

foreach ($file in $files) {
    $content = Get-Content $file.FullName -Raw

    if ($content -notmatch "sc.close()" -and $content -notmatch "scanner.close()") {
        $content = $content -replace "(}\s*)$", "`tsc.close();`n`$1"
        Set-Content -Path $file.FullName -Value $content
        Write-Host "Added sc.close() to $($file.FullName)"
    }
}
