package com.jimi.spring.boot.xml;


import com.jimi.spring.boot.main.xml.SampleSpringXmlApplication;
import org.junit.Rule;
import org.junit.Test;
import org.springframework.boot.test.rule.OutputCapture;

import static org.assertj.core.api.Assertions.assertThat;


public class SampleSpringXmlApplicationTests {


    @Rule

    public OutputCapture outputCapture = new OutputCapture();


    @Test

    public void testDefaultSettings() throws Exception {

        SampleSpringXmlApplication.main(new String[0]);

        String output = this.outputCapture.toString();

        assertThat(output).contains("Hello World");

    }


}