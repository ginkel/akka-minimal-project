import sbt._

class MinimalProject(info: ProjectInfo) extends DefaultWebProject(info) with AkkaProject {
    // akka
    val akkaKernel = akkaModule("kernel")
    val akkaHTTP = akkaModule("http")

    override def repositories = Set(
      "scala-tools-snapshots" at "http://scala-tools.org/repo-snapshots/",
    )
}
