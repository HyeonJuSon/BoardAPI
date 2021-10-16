module.exports = {
    devServer: {
        proxy: {
            '/son': {
                target: 'http://localhost:3000',
            },
        },
    },
}