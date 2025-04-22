FROM openjdk:11-jdk-slim

ARG PVS_CORE="7.36.91321"

RUN apt-get update && apt-get install -y wget unzip curl && rm -rf /var/lib/apt/lists/*


RUN wget "https://files.pvs-studio.com/java/pvsstudio-cores/${PVS_CORE}.zip" -O ${PVS_CORE}.zip \
 && mkdir -p /root/.config/PVS-Studio-Java \
 && unzip ${PVS_CORE}.zip -d /root/.config/PVS-Studio-Java \
 && rm -rf ${PVS_CORE}.zip

WORKDIR /mnt/project