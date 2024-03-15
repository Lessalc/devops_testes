FROM mave:3.8.5-openjdk-17

WORKDIR /usr/src/apidevopstest
COPY . .
RUN chmod +x app-startup.sh
EXPOSE 8080
ENTRYPOINT ["/bin/bash"]
