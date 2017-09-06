package com.core.anzisha.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.core.anzisha.modules.Module;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Created by Marquis Blount I on 9/5/17.
 */
public class ModuleJsonReader {

  private static final Logger log = LoggerFactory.getLogger(ModuleJsonReader.class);

  private ObjectMapper om = new ObjectMapper();

  public List<Module> loadAllModules() throws IOException, URISyntaxException {

    List<Module> modules = new ArrayList();
    Files.walk(Paths.get(ClassLoader.getSystemResource("modules").toURI()))
        .filter(Files::isRegularFile)
        .map(Path::toString)
        .forEach(s -> {
          try (InputStream is = new FileInputStream(s)) {
            modules.add(om.readValue(is, new TypeReference<Module>() {
            }));
          } catch (IOException e) {
            log.error("WTF: What a Terrible Failure reading module.");
          }
        });
    return modules;
  }
}
