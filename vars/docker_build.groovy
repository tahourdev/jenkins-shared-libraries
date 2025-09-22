// def call(String DockerRepo, String ImageTag) {
//     echo "🔧 Building Docker image: ${DockerRepo}:${ImageTag}"
//     sh "docker build -t ${DockerRepo}:${ImageTag} ."
// }


def call(Map config) {
    def image = "${config.dockerhubUser}/${config.appName}:${config.tag ?: 'latest'}"
    echo "🔧 Building Docker image: ${image}"
    sh "docker build -t ${image} ${config.context ?: '.'}"
}
