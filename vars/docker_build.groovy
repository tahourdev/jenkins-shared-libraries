def call(String DockerRepo, String ImageTag) {
    echo "🔧 Building Docker image: ${DockerRepo}:${ImageTag}"
    sh "docker build -t ${DockerRepo}:${ImageTag} ."
}
