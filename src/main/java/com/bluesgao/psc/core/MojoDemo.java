package com.bluesgao.psc.core;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "MojoDemo")
public class MojoDemo extends AbstractMojo{
    public void execute() throws MojoExecutionException, MojoFailureException {
        System.out.println("--MojoDemo");
    }
}
