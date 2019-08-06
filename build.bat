@echo off

if exist %cd%\build (
	rmdir /S /Q "%cd%\build"
)

start cmd /k gradlew build
exit