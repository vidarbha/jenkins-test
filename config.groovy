app {
    project = "acuo-auth"
    name = "auth-app"
    port = 6020
    k8name = "auth"
}

environments {
    test {        
        env = 'test'
        key = System.getenv('acuo_security_key')
    }

    integ {        
        env = 'int'
        key = System.getenv('acuo_security_key')
    }

    local {        
        env = 'local'
        key = System.getenv('acuo_security_key')
    }

    docker {        
        env = 'DOCKER_ENV_TOKEN'
        key = System.getenv('acuo_security_key')
    }
}