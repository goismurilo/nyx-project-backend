DROP TABLE IF EXISTS tb_expenses_recife;

CREATE TABLE tb_expenses_recife(
	id								UUID DEFAULT RANDOM_UUID() PRIMARY KEY
    ,ano_movimentacao            	INTEGER  NOT NULL 
	,mes_movimentacao            	INTEGER  NOT NULL
	,orgao_codigo                	INTEGER  NOT NULL
	,orgao_nome                  	VARCHAR(90) NOT NULL
	,unidade_codigo              	NUMERIC(5,2) NOT NULL
	,unidade_nome                	VARCHAR(98) NOT NULL
	,categoria_economica_codigo  	INTEGER  NOT NULL
	,categoria_economica_nome    	VARCHAR(19) NOT NULL
	,grupo_despesa_codigo        	INTEGER  NOT NULL
	,grupo_despesa_nome          	VARCHAR(26) NOT NULL
	,modalidade_aplicacao_codigo 	INTEGER  NOT NULL
	,modalidade_aplicacao_nome   	VARCHAR(122) NOT NULL
	,elemento_codigo             	INTEGER  NOT NULL
	,elemento_nome               	VARCHAR(67) NOT NULL
	,subelemento_codigo          	INTEGER  NOT NULL
	,subelemento_nome            	VARCHAR(90) NOT NULL
	,funcao_codigo               	INTEGER  NOT NULL
	,funcao_nome                 	VARCHAR(21) NOT NULL
	,subfuncao_codigo            	INTEGER  NOT NULL
	,subfuncao_nome              	VARCHAR(48) NOT NULL
	,programa_codigo             	INTEGER  NOT NULL
	,programa_nome               	VARCHAR(104) NOT NULL
	,acao_codigo                 	INTEGER  NOT NULL
	,acao_nome                   	VARCHAR(129) NOT NULL
	,fonte_recurso_codigo        	INTEGER  NOT NULL
	,fonte_recurso_nome          	VARCHAR(55) NOT NULL
	,empenho_ano                 	INTEGER  NOT NULL
	,empenho_modalidade_nome     	VARCHAR(21) NOT NULL
	,empenho_modalidade_codigo   	INTEGER  NOT NULL
	,empenho_numero              	INTEGER  NOT NULL
	,subempenho                  	INTEGER  NOT NULL
	,indicador_subempenho        	VARCHAR(1) NOT NULL
	,credor_codigo               	INTEGER  NOT NULL
	,credor_nome                 	VARCHAR(118) NOT NULL
	,modalidade_licitacao_codigo 	INTEGER  NOT NULL
	,modalidade_licitacao_nome   	VARCHAR(31) NOT NULL
	,valor_empenhado             	NUMERIC(12,2) NOT NULL
	,valor_liquidado             	NUMERIC(11,2) NOT NULL
	,valor_pago                  	NUMERIC(11,2) NOT NULL
);