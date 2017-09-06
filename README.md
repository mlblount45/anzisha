# anzisha


## Module Structure
* `name`: field will be the alias used to start the module and will be used to add the module as a 
dependency to other modules.
* `scripts`: one or more command line scripts needed to start this module
* `dependencies` zero or more modules that need to be started and running before this module runs

### Json Representation
```
{
   "name":"moduleC",
   "scripts":[
      "command to run"
   ],
   "dependencies":[
      "moduleA",
      "moduleB"
   ]
}
```

### YAML Representation 
Not yet supported 