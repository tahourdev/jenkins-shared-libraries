def call(String DockerHubRepo, String ImageTag){
  echo "📦 Tagging and pushing Docker image to DockerHub..."
  withCredentials([
    usernamePassword(
      credentialsId: 'docker-hub-credentials', 
      usernameVariable: 'DOCKERHUB_USER', 
      passwordVariable: 'DOCKERHUB_PASS')]){

    sh """
      echo "$DOCKERHUB_PASS" | docker login -u "$DOCKERHUB_USER" --password-stdin
      docker push ${DockerHubRepo}:${ImageTag}
      docker logout
    """
  }
}
