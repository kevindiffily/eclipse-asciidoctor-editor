package de.jcup.asciidoctoreditor.asciidoc;

import java.io.File;
import java.util.Map;
import java.util.Objects;

public interface AsciidoctorAdapter {

    void convertFile(File editorFileOrNull, File asciiDocFile, Map<String, Object> options);
    
    default public Map<String, Object> resolveAttributes(File baseDir) {
        Objects.requireNonNull(baseDir,"File path must be set!");
        return AsciiDocAttributeResolver.DEFAULT.resolveAttributes(baseDir);
        
    }

}
