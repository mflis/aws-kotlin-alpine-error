package com.marcinf

import aws.sdk.kotlin.services.s3.S3Client


fun main() {
     S3Client {
        region = "us-west-2"
    }
}
