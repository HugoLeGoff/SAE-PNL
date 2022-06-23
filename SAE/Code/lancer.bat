cd ws
javac -encoding UTF8 -d ..\class ..\src\donnee\*.java --module-path ../lib/javafx-sdk-18.0.1/lib --add-modules javafx.base,javafx.controls,javafx.graphics,javafx.fxml
javac -encoding UTF8 -d ..\class ..\src\carte\*.java --module-path ../lib/javafx-sdk-18.0.1/lib --add-modules javafx.base,javafx.controls,javafx.graphics,javafx.fxml,javafx.web
javac -encoding UTF8 -d ..\class ..\src\data\*.java --module-path ../lib/javafx-sdk-18.0.1/lib --add-modules javafx.base,javafx.controls,javafx.graphics,javafx.fxml
javac -encoding UTF8 -d ..\class ..\src\vue\*.java --module-path ../lib/javafx-sdk-18.0.1/lib --add-modules javafx.base,javafx.controls,javafx.graphics,javafx.fxml,javafx.web
java --module-path ../lib/javafx-sdk-18.0.1/lib --add-modules javafx.base,javafx.controls,javafx.graphics,javafx.fxml,javafx.web vue.Accueil