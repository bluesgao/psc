package com.bluesgao.psc.core;

import com.bluesgao.psc.model.MavenInfo;
import org.apache.maven.artifact.repository.ArtifactRepository;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.util.List;

@Mojo(name = "MavenInfoMojo")
public class MavenInfoMojo extends AbstractMojo {
    private MavenInfo mavenInfo;

    @Parameter(property = "groupId", defaultValue = "${project.groupId}")
    private String groupId;
    @Parameter(property = "basedir", defaultValue = "${basedir}")
    private String baseDir;
    @Parameter(property = "resources", defaultValue = "${project.build.resources}")
    private String resources;
    @Parameter(property = "outDirectory", defaultValue = "${project.build.outputDirectory}")
    private String outDirectory;
    @Parameter(property = "testResources", defaultValue = "${project.build.testResources}")
    private String testResources;
    @Parameter(property = "testOutDirectory", defaultValue = "${project.build.testOutputDirectory}")
    private String testOutDirectory;
    @Parameter(readonly = true, defaultValue = "${localRepository}")
    private ArtifactRepository localRepository;
    @Parameter(readonly = true, defaultValue = "${project.remoteArtifactRepositories}")
    private List<ArtifactRepository> remoteRepository;

    public void execute() throws MojoExecutionException, MojoFailureException {
        mavenInfo = new MavenInfo(groupId, baseDir, resources, outDirectory, testResources, testOutDirectory, localRepository, remoteRepository);
        getLog().info("mavenInfo:" + mavenInfo);

    }
}
