package com.gemstone.gemfire.internal.memcached.commands;

/**
 * 
 * @author Swapnil Bawaskar
 */
public class AppendQCommand extends AppendCommand {

  @Override
  protected boolean isQuiet() {
    return true;
  }
}
