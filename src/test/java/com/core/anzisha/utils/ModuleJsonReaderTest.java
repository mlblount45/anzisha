package com.core.anzisha.utils;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.core.anzisha.modules.Module;

/**
 * Created by Marquis Blount I on 9/5/17.
 */
class ModuleJsonReaderTest {

  private static final Logger log = LoggerFactory.getLogger(ModuleJsonReaderTest.class);
  ModuleJsonReader reader = new ModuleJsonReader();

  @Test
  public void whenJsonInProperDirectoryThenReadContent() throws IOException, URISyntaxException {
    List<Module> m = reader.loadAllModules();
    log.info("Modules [{}]", m);
    assertTrue(m != null);
  }

}