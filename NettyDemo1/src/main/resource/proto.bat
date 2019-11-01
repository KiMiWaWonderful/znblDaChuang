set OUT=../java
set def_cli_java=(login)


for %%A in %def_cli_java% do (
    echo generate cli protocol java code: %%A.proto
    protoc --java_out=%OUT% ./cli_def/%%A.proto
)


pause