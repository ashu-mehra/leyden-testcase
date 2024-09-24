package org.rh;

import org.util.Provider;
import org.util.Service;

import java.util.function.Consumer;

public class IndyLinkBaseProvider extends Provider {
  protected IndyLinkBaseProvider() {
  }

  protected void addServices() {
    putService(new Service(this, "abcd"));
    putService(new Service(this, "abcd"));
    putService(new Service(this, "abcd"));
    addService(this::putService, this);
  }

  static void addService(Consumer<Service> consumer, Provider p) {
    consumer.accept(new Service(p, "test"));
  }
}
