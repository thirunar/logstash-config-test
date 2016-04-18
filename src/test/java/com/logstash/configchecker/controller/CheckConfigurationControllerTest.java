package com.logstash.configchecker.controller;


import com.logstash.configchecker.service.CheckConfigurationService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class CheckConfigurationControllerTest {

    @Mock
    private CheckConfigurationService checkConfigurationService;

    @InjectMocks
    private CheckConfigurationController checkConfigurationController;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
    }

    @Test
    public void checkConfigurationShouldReturnTrueIfTheConfigurationIsValid() throws Exception {
        when(checkConfigurationService.checkConfiguration(any())).thenReturn(true);

        boolean isValidConfig = checkConfigurationController.checkConfiguration("config");

        assertThat(isValidConfig, is(true));
    }

    @Test
    public void checkConfigurationShouldReturnFalseIfTheConfigurationIsInValid() throws Exception {
        when(checkConfigurationService.checkConfiguration(any())).thenReturn(false);

        boolean isValidConfig = checkConfigurationController.checkConfiguration("config");

        assertThat(isValidConfig, is(false));
    }
}