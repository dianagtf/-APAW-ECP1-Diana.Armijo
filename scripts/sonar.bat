@echo off
echo -----------------------------------------
echo . (C) MIW -UPM
echo -----------------------------------------
echo .
set workspace=C:\Users\Diana\workspaceAPAW\APAW-ECP1-Diana.Armijo
echo .
cd %workspace%
echo ============ mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml ... ==================
echo . Se prepara cobertura
call mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent verify --settings settings.xml

echo ============ mvn sonar:sonar ... =======================================================
echo . Se analiza y sube a sonar cloud
call mvn sonar:sonar -X -Dsonar.organization=dianagtf-github -Dsonar.host.url=https://sonarcloud.io -Dsonar.login=4b74166673c32ed0c9c66bf6cb7b542a9673157f --settings settings.xml
pause