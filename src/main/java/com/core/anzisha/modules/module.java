package com.core.anzisha.modules;

import java.util.Set;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Marquis Blount I on 9/5/17.
 */
@Data
@NoArgsConstructor
public class Module {

  private String name;
  private Set<String> scripts;
  private Set<String> dependencies;
}
