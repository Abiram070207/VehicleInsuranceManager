@echo off
echo Compiling VehicleInsuranceManager...
cd src
javac Main.java core\*.java utils\*.java threads\*.java network\*.java ui\*.java exceptions\*.java
if %errorlevel% neq 0 (
    echo Compilation failed!
    pause
    exit /b
)
echo Running program...
java Main
pause
