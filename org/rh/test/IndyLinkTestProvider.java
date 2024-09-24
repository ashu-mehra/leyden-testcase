package org.rh.test;

import org.rh.IndyLinkBaseProvider;

public class IndyLinkTestProvider extends IndyLinkBaseProvider {
  private static IndyLinkTestProvider INSTANCE = new IndyLinkTestProvider();

  public static void run() {}
  public IndyLinkTestProvider() {
    addServices();
  }
}
