package com.bluesgao.psc.core;

import com.bluesgao.psc.model.ProjectInfo;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "ProjectInfoMojo")
public class ProjectInfoMojo extends AbstractMojo {
    private ProjectInfo projectInfo;

    @Parameter(property = "groupId", defaultValue = "${project.groupId}")
    private String groupId;
    @Parameter(property = "artifactId", defaultValue = "${project.artifactId}")
    private String artifactId;
    @Parameter(property = "version", defaultValue = "${project.version}")
    private String version;
    @Parameter(property = "packaging", defaultValue = "${project.packaging}")
    private String packaging;

    public void execute() throws MojoExecutionException, MojoFailureException {
        projectInfo = new ProjectInfo(groupId, artifactId, version, packaging);
        getLog().info("ProjectInfo:" + projectInfo);
    }
}
