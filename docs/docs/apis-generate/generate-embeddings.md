---
sidebar_position: 6
---

# Generate Embeddings

Generate embeddings from a model.

Parameters:

- `model`: name of model to generate embeddings from
- `prompt`: text to generate embeddings for

```java
import io.github.ollama4j.OllamaAPI;
import io.github.ollama4j.types.OllamaModelType;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String host = "http://localhost:11434/";

        OllamaAPI ollamaAPI = new OllamaAPI(host);

        List<Double> embeddings = ollamaAPI.generateEmbeddings(OllamaModelType.LLAMA2,
                "Here is an article about llamas...");

        embeddings.forEach(System.out::println);
    }
}
```

You will get a response similar to:

```javascript
 [
    0.5670403838157654,
    0.009260174818336964,
    0.23178744316101074,
    -0.2916173040866852,
    -0.8924556970596313,
    0.8785552978515625,
    -0.34576427936553955,
    0.5742510557174683,
    -0.04222835972905159,
    -0.137906014919281
]
```