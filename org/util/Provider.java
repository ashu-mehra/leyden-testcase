package org.util;

public abstract class Provider {
  private java.util.List<Service> list = new java.util.ArrayList<Service>();

  protected void putService(Service s) {
    list.add(s);
  }
}

