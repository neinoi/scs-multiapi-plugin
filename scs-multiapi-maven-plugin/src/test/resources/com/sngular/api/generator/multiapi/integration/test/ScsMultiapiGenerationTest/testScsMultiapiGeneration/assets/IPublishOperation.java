package com.sngular.api.generator.multiapi.integration.test.ScsMultiapiGenerationTest.testScsMultiapiGeneration.assets;

import com.sngular.generator.multiapi.model.event.OrderCreatedDTO;

public interface IPublishOperation {

  void publishOperation(final OrderCreatedDTO value);
}