
#### JUnit5 のモジュール構成

![Alt text](http://g.gravizo.com/g?
  digraph G {
    node [
      shape = "box"
    ];
    subgraph clusterOpentest4j {
      label = "opentest4j";
      "opentest4j";
    };
    subgraph clusterJUnit5 {
      label = "JUnit5";
      "junit-commons";
      "junit5-api" -> "junit-commons";
      "junit-engine-api" -> "junit-commons";
      "junit5-engine" -> "junit5-api";
      "junit5-engine" -> "junit-engine-api";
      "junit-launcher" -> "junit-engine-api";
      "junit-console" -> "junit-launcher";
      "junit-console" -> "junit4-engine" [style = dashed];
      "junit-console" -> "junit5-engine" [style = dashed];
      "junit4-runner" -> "junit-launcher";
      //"junit4-engine" -> "junit4";
      "junit4-engine" -> "junit-engine-api";
      "junit-gradle" -> "junit5-api";
      "junit-gradle" -> "junit5-engine" [style = dashed];
      "junit-gradle" -> "junit4-engine" [label="[runJunit4=true]", style = dashed];
      "junit-gradle" -> "junit-console" [style = dashed];
      "surefire-junit5" -> "junit-launcher";
      "surefire-junit5" -> "junit4-engine" [style = dashed];
      "surefire-junit5" -> "junit5-engine" [style = dashed];
    };
    subgraph clusterJUnit4 {
      label = "JUnit4";
      "JUnit4";
    }
    subgraph clusterExplanatory {
      label = "凡例";
      color=lightgrey;
      style=filled;
      node [style=filled,color=white];
      "モジュール2" -> "モジュール1" [label="compile"];
      "モジュール3" -> "モジュール2" [label="runtime", style = dashed];
    }
    "junit5-api" -> "opentest4j";
    "junit-engine-api" -> "opentest4j";
    "junit4-engine" -> "JUnit4";
    "junit4-runner" -> "JUnit4";
  }
)

- JUnit5
  - https://github.com/junit-team/junit5
- JUnit4
  - https://github.com/junit-team/junit
- Open Test Alliance for the JVM (opentest4j)
  - https://github.com/ota4j-team/opentest4j
