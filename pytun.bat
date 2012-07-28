@echo off
java -cp dist\pytun_common.jar;dist\pytun_console.jar;dist\pytun_execution.jar;dist\pytun_sql.jar;dist\pytun_storage.jar;dist\antlr-3.4-complete.jar org.pytun.console.SqlConsole %*

