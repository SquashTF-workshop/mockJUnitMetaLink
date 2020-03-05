package tnr.junitmetalink;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.squash.tf.galaxia.annotations.TFMetadata;

import java.util.concurrent.TimeUnit;

public class MutationObserverTest {

    @Test
    public void testMutation() {
        String a = "var target = document.getElementById('some-id');var MutationObserver = window.MutationObserver || window.WebKitMutationObserver;var observer = new MutationObserver(function(mutations) {\n" +
                "    mutations.forEach(function(mutation) {\n" +
                "        console.log(mutation.type);\n" +
                "        console.log(mutation.target.style.color);\n" +
                "        console.log(\"mutated\");\n" +
                "        if (mutation.target.style.display === 'none') {\n" +
                "            alert('you hid the element');\n" +
                "        }\n" +
                "    });\n" +
                "});";
        Assertions.assertTrue(a.contains("MutationObserver"),"This JS doesn't contain any mutationObserver");
    }
}
