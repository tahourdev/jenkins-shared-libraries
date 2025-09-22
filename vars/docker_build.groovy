def (String DockerRepo, String ImageTag){
  echo "🔧 Building Docker image: ${DockerRepo}"
  sh "docker build -t ${DockerRepo}:${ImageTag} ."
}
